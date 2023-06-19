<!DOC TYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Калькулятор каллорий</title>
    <link rel="stylesheet" type="text/css" href="counting.css">
</head>
<body>
    <center><h2>Калькулятор каллорий по формуле Миффлина-Сан Жеора</h2></center>
<form action="/calculate" class="form1" method="post">
    Введите ваш возраст: <input class="inputAge" type="text" maxlength="2" "name="age" size="5"/><br><br>
    Выберите ваш пол: М<input type="radio" name="man"/>Ж<input type="radio" name="women"/><br><br>
    Введите ваш вес в киллограммах: <input type="text" maxlength="3" name="weight" size="5"/><br><br>
    Введите ваш рост в сантиметрах: <input type="text" maxlength="3" name="height" size="5"/><br><br>
    Выберите степень физической активности: <select class="cof">
                                                <option>Нет физических нагрузок и сидячая работа</option>
                                                <option>Легкие физические нагрузки 1–3 раза в неделю</option>
                                                <option>Силовые нагрзуки средней интенсивностью 3–5 раз в неделю</option>
                                                <option>Силовые тренировки 6–7 раз в неделю</option>
                                                <option>Физическая работа, силовые тренировки 2 раза в день</option>
                                              </select>
        <center><button type="submit">Рассчитать</button></center>
</form>
<center>${sum}</center>
</body>
</html>