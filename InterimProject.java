public class Main {
    /*
    http://api.openweathermap.org/data/2.5/weather?id=2023469&appid=YOURKEY

     */
    public static void main(String[] args) throws
            IOException, MalformedURLException, JSONException
    {
        String weather = "{\"coord\":{\"lon\":104.3,\"lat\":52.3},\"weather\":[{\"id\":741,\"main\":\"Fog\",\"description\":\"fog\",\"icon\":\"50d\"}],\"base\":\"stations\",\"main\":{\"temp\":272.15,\"pressure\":1021,\"humidity\":100,\"temp_min\":272.15,\"temp_max\":272.15},\"visibility\":750,\"wind\":{\"speed\":2,\"deg\":90},\"clouds\":{\"all\":90},\"dt\":1508470200,\"sys\":{\"type\":1,\"id\":7254,\"message\":0.0038,\"country\":\"RU\",\"sunrise\":1508456206,\"sunset\":1508493449},\"id\":2023469,\"name\":\"Irkutsk\",\"cod\":200}";
        String data = "{ 'name': 'Vasya', 'work': {'company' : 'ISU', 'salary': '100000'} }";
        JSONObject jdata = new JSONObject(data);
        String name = jdata.getString("name");
        JSONObject work = jdata.getJSONObject("work");
        int salary = work.getInt("salary");
        long sunrise = 1508456206;
        Date sunrisedate = new Date(1508456206 * 1000L);
        System.out.println(sunrisedate);

        System.out.println(name + ", salary is " + salary);
        // Используя полученную по API строку с прогнозом погоды
        // 1) вывести название города, температуру (в гр. Цельсия) и влажность
        // 2) время восхода и заката, долготу дня

        /*
        // запрос прогноза погоды в JSON
        System.setProperty("http.proxyHost", "192.168.105.50");
        System.setProperty("http.proxyPort", "3128");
        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?id=2023469&appid=d6843ab8ee963f5d372296dfff62aed7");
        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while (in.hasNext()) {
            result += in.nextLine();
        }
        System.out.println(result);
        */
    }
}