<!DOCTYPE html>
<html>
<head>
    <title>会议管理系统</title>
    <link rel="stylesheet" href="/styles/common.css"/>
    <style type="text/css">
        #divfrom {
            float: left;
            width: 150px;
        }

        #divto {
            float: left;
            width: 150px;
        }

        #divoperator {
            float: left;
            width: 50px;
            padding: 60px 5px;
        }

        #divoperator input[type="button"] {
            margin: 10px 0;
        }

        #selDepartments {
            display: block;
            width: 100%;
        }

        #selEmployees {
            display: block;
            width: 100%;
            height: 200px;
        }

        #selSelectedEmployees {
            display: block;
            width: 100%;
            height: 225px;
        }
    </style>
    <script type="application/javascript">
        function employee(employeeid, employeename) {
            this.employeeid = employeeid;
            this.employeename = employeename;
        }

        function department(departmentid, departmentname, employees) {
            this.departmentid = departmentid;
            this.departmentname = departmentname;
            this.employees = employees;
        }

        var data = new Array(
            new department(1, "技术部", new Array(
                new employee(1001, "a00"), new employee(1002, "a01"), new employee(1003, "a02"), new employee(1004, "a03"))),
            new department(2, "销售部", new Array(
                new employee(2001, "b00"), new employee(2002, "b01"), new employee(2003, "b02"), new employee(2004, "b03"))),
            new department(3, "市场部", new Array(
                new employee(3001, "c00"), new employee(3002, "c01"), new employee(3003, "c02"), new employee(3004, "c03"))),
            new department(4, "行政部", new Array(
                new employee(4001, "d00"), new employee(4002, "d01"), new employee(4003, "d02"), new employee(4004, "d03"))));

        var selDepartments;
        var selEmployees;
        var selSelectedEmployees;

        function body_load() {
            selDepartments = document.getElementById("selDepartments");
            selEmployees = document.getElementById("selEmployees");
            selSelectedEmployees = document.getElementById("selSelectedEmployees");

            for (var i = 0; i < data.length; i++) {
                var dep = document.createElement("option");
                dep.value = data[i].departmentid;
                dep.text = data[i].departmentname;
                selDepartments.appendChild(dep);
            }

            fillEmployees();
        }

        function fillEmployees() {
            clearList(selEmployees);
            var departmentid = selDepartments.options[selDepartments.selectedIndex].value;
            var employees;
            for (var i = 0; i < data.length; i++) {
                if (departmentid == data[i].departmentid) {
                    employees = data[i].employees;
                    break;
                }
            }
            for (i = 0; i < employees.length; i++) {
                var emp = document.createElement("option");
                emp.value = employees[i].employeeid;
                emp.text = employees[i].employeename;
                selEmployees.appendChild(emp);
            }
        }

        function clearList(list) {
            while (list.childElementCount > 0) {
                list.removeChild(list.lastChild);
            }
        }

        function selectEmployees() {
            for (var i = 0; i < selEmployees.options.length; i++) {
                if (selEmployees.options[i].selected) {
                    addEmployee(selEmployees.options[i]);
                    selEmployees.options[i].selected = false;
                }
            }
        }

        function deSelectEmployees() {
            var elementsToRemoved = new Array();
            var options = selSelectedEmployees.options;
            for (var i = 0; i < options.length; i++) {
                if (options[i].selected) {
                    elementsToRemoved.push(options[i]);
                }
            }
            for (i = 0; i < elementsToRemoved.length; i++) {
                selSelectedEmployees.removeChild(elementsToRemoved[i]);
            }
        }

        function addEmployee(optEmployee) {
            var options = selSelectedEmployees.options;
            var i = 0;
            var insertIndex = -1;
            while (i < options.length) {
                if (optEmployee.value == options[i].value) {
                    return;
                } else if (optEmployee.value < options[i].value) {
                    insertIndex = i;
                    break;
                }
                i++;
            }
            var opt = document.createElement("option");
            opt.value = optEmployee.value;
            opt.text = optEmployee.text;

            if (insertIndex == -1) {
                selSelectedEmployees.appendChild(opt);
            } else {
                selSelectedEmployees.insertBefore(opt, options[insertIndex]);
            }
        }
    </script>
</head>
<body onload="body_load()">
<#include 'top.ftl'>
<div class="page-body">
    <#include 'leftMenu.ftl'>
    <div class="page-content">
        <div class="content-nav">
            会议预定 > 预定会议
        </div>
        <form>
            <fieldset>
                <legend>会议信息</legend>
                <table class="formtable">
                    <tr>
                        <td>会议名称：</td>
                        <td>
                            <input type="text" id="meetingname" maxlength="20"/>
                        </td>
                    </tr>
                    <tr>
                        <td>预计参加人数：</td>
                        <td>
                            <input type="text" id="numofattendents"/>
                        </td>
                    </tr>
                    <tr>
                        <td>预计开始时间：</td>
                        <td>
                            <input type="date" id="startdate"/>
                            <input type="time" id="starttime"/>
                        </td>
                    </tr>
                    <tr>
                        <td>预计结束时间：</td>
                        <td>
                            <input type="date" id="enddate"/>
                            <input type="time" id="endtime"/>
                        </td>
                    </tr>
                    <tr>
                        <td>会议室名称：</td>
                        <td>
                            <select name="roomid">
                                <option value="1">第一会议室</option>
                                <option value="2">第二会议室</option>
                                <option value="3">第三会议室</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>会议说明：</td>
                        <td>
                            <textarea id="description" rows="5"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>选择参会人员：</td>
                        <td>
                            <div id="divfrom">
                                <select id="selDepartments" onchange="fillEmployees()">
                                </select>
                                <select id="selEmployees" multiple="true">
                                </select>
                            </div>
                            <div id="divoperator">
                                <input type="button" class="clickbutton" value="&gt;" onclick="selectEmployees()"/>
                                <input type="button" class="clickbutton" value="&lt;" onclick="deSelectEmployees()"/>
                            </div>
                            <div id="divto">
                                <select id="selSelectedEmployees" multiple="true">
                                </select>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td class="command" colspan="2">
                            <input type="submit" class="clickbutton" value="预定会议"/>
                            <input type="reset" class="clickbutton" value="重置"/>
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </div>
</div>
<#include 'footer.ftl'>
</body>
</html>