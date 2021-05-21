/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> addresses = new HashMap<String, String>();
        while (true)
        {
            String city = reader.readLine();
            if(city.isEmpty()) break;
            String name = reader.readLine();
            if (!city.isEmpty() & !name.isEmpty())
            {
                addresses.put(city, name);
            }
            else break;
        }
        String tempCity = reader.readLine();
        for (Map.Entry<String, String> pair: addresses.entrySet())
        {
            String city = pair.getKey();

            if (tempCity.equals(city))
            {
                String name = pair.getValue();
                System.out.println(name);
            }
        }
    }
}
