# DZ-8
robot_dreams school / QA automation course / Lesson 16 Exceptions
====================
ЗАВДАННЯ
====================

1. Створити новий IntelliJ-проект

2. Скопіювати у папку src проекту з пункту 1 все, що лежить у папці lection 16 exceptions/src (link). У проекті має лежати 6 класів:
WrongAccountException, WrongCurrencyException, WrongOperationException,Account, BankApplication, Main

3. У Main методі main класу створити обєкт типу BankApplication

4. Викликати метод process з наступними параметрами:

4.1 id = accountId000, amount 50, currency USD

4.2 id = accountId003, amount 250, currency HRV

4.3 id = accountId001, amount 50, currency EUR

4.4 id = accountId001, amount 50, currency USD

4.4 id = accountId001, amount 50, currency USD

5. Кожен метод огорнути в try catch finally структуру і для кожного з 
WrongAccountException, WrongCurrencyException, WrongOperationException, Exception 
виводити в консоль змістовне повідомлення:

Такого акаунту не існує
Акаунт має рахунок в іншій валюті
Акаунт не має достатньо коштів
Сталася помилка при процесінгу, спробуйте ще раз
У finally потрібно виводити повідомлення:

Дякуємо, що скористалися нашим сервісом
Формат здачі: Прикріпити посилання на Pull request з файлами на GitHub.