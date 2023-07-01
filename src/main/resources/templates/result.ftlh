<!DOC TYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Результат</title>
</head>
<body>
<center><h2>Калькулятор каллорий по формуле Миффлина-Сан Жеора, новый расчет</h2></center>
<form method="post">
        Введите ваш возраст: <input type="text" name="age" required maxlength="2" placeholder="Возраст" size="5"/><br><br>
        Введите ваш вес в киллограммах: <input type="text" required maxlength="3" placeholder="Вес" name="weight" size="5"/><br><br>
        Введите ваш рост в сантиметрах: <input type="text" required maxlength="3" placeholder="Рост" name="height" size="5"/><br><br>
        Выберите ваш пол: <select name="floor">
                            <option value="man">Мужской</option>
                            <option value="women">Женский</option>
                          </select><br><br>
        <button type="submit">Посчитать</button>
    </form>

    <a href="/counting_kkal">Главная страница</a>

<#if sex == "man">
    <h1><center>Ваш результат</h1></center>
    <center><table border="1" cellpadding="5">
        <tr>
            <th>Активность</th>
            <#list ratio as el>
                <th>${el}</th>
                </#list>
        </tr>
        <tr>
            <th>Поддержание веса</th>
            <#list maintenanceManActivity as el>
                <th>${el}Ккал</th>
                </#list>
            </tr>
            <tr>
            <th>Набор веса</th>
                <#list setManActivity as el>
                    <th>${el}Ккал</th>
                    </#list>
            </tr>
            <tr>
            <th>Сброс веса</th>
                <#list dialManActivity as el>
                    <th>${el}Ккал</th>
                    </#list>
            </tr>
    </table></center>
<#else>
        <h1><center>Ваш результат</h1></center>
        <center><table border="1" cellpadding="5">
            <tr>
                <th>Активность</th>
                <#list ratio as el>
                    <th>${el}</th>
                    </#list>
            </tr>
            <tr>
                <th>Поддержание веса</th>
                <#list maintenanceWomenActivity as el>
                    <th>${el}Ккал</th>
                    </#list>
                </tr>
                <tr>
                <th>Набор веса</th>
                    <#list setWomen as el>
                        <th>${el}Ккал</th>
                        </#list>
                </tr>
                <tr>
                <th>Сброс веса</th>
                    <#list dialWomen as el>
                        <th>${el}Ккал</th>
                        </#list>
                </tr>
        </table></center>
</#if>
</body>
</html>