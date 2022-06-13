static void Main()
{
    string text = "";
    using (StreamReader fs = new StreamReader(@"С:\dir_1.txt"))
    {
        while (true)
        {
            // Читаем строку из файла во временную переменную.
            string temp = fs.ReadLine();
            // Если достигнут конец файла, прерываем считывание.
            if(temp == null) break;
            // Пишем считанную строку в итоговую переменную.
            text  += temp;
        }
     }
     // Выводим на экран.
     Console.WriteLine(text);
}
