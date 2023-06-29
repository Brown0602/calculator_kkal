<!DOC TYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Калькулятор ккал</title>
</head>
<body>
<center><h2>Калькулятор каллорий по формуле Миффлина-Сан Жеора</h2></center>
    <form action="counting_kkal/result" method="post">
        Введите ваш возраст: <input type="text" name="age" required maxlength="2" placeholder="Возраст" size="5"/><br><br>
        Введите ваш вес в киллограммах: <input type="text" required maxlength="3" placeholder="Вес" name="weight" size="5"/><br><br>
        Введите ваш рост в сантиметрах: <input type="text" required maxlength="3" placeholder="Рост" name="height" size="5"/><br><br>
        Выберите ваш пол: <select name="floor">
                            <option value="man">Мужской</option>
                            <option value="women">Женский</option>
                          </select><br><br>
        <button type="submit">Посчитать</button>
    </form>
</body>
</html>