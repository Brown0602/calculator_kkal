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
        <button type="submit">Посчитать</button>
    </form>
    <h1><center>Таблица для мужского пола</h1></center>
    <center><table border="1" cellpadding="5">
        <tr>
            <th>Активность</th>
            <#list ratio as el>
                <th>${el}</th>
                </#list>
        </tr>
        <tr>
            <th>Поддержание веса</th>
            <#list resultManMaintenanceActivity as el>
                <th>${el}Ккал</th>
                </#list>
            </tr>
            <tr>
            <th>Набор веса</th>
                <#list resultManSetActivity as el>
                    <th>${el}Ккал</th>
                    </#list>
            </tr>
            <tr>
            <th>Сброс веса</th>
                <#list resultManDialActivity as el>
                    <th>${el}Ккал</th>
                    </#list>
            </tr>
    </table></center>
<h1><center>Таблица для женского пола</h1></center>
<center><table border="1" cellpadding="5">
        <tr>
            <th>Активность</th>
            <#list ratio as el>
                <th>${el}</th>
                </#list>
        </tr>

        <tr>
            <th>Поддержание веса</th>
            <#list resultWomenMaintenanceActivity as el>
                <th>${el}Ккал</th>
                </#list>
            </tr>

            <tr>
            <th>Набор веса</th>
                <#list resultWomenSetActivity as el>
                    <th>${el}Ккал</th>
                    </#list>
            </tr>

            <tr>
            <th>Сброс веса</th>
                <#list resultWomenDialActivity as el>
                    <th>${el}Ккал</th>
                    </#list>
            </tr>
    </table></center>

</body>
</html>