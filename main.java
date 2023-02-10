package flat;

import java.util.*;

public class main {
    public static void main(String[] args) {
        List<RealEstate> realEstateList = new ArrayList<>();
        Random random = new Random();

        //генерим 50 объетов
        for (int i = 0; i < 50; i++) {
            int randomType = random.nextInt(3) + 1;
            switch (randomType) {
                case 1:
                    realEstateList.add(
                            new Flat(
                                    random.nextInt(50000) + 1000,
                                    random.nextInt(1) + 11,
                                    random.nextInt(200) + 50,
                                    random.nextInt(100) + 10,
                                    random.nextInt(50) + 1,
                                    random.nextInt(50) + 1,
                                    random.nextInt(300) + 1

                            )


                    );

                    break;
                case 2:
                    realEstateList.add(
                            new House(
                                    random.nextInt(50000) + 1000,
                                    random.nextInt(300) + 100,
                                    random.nextInt(150) + 50,
                                    random.nextInt(150) + 50,
                                    random.nextInt(10) + 1
                            )
                    );
                    break;
                case 3:
                    realEstateList.add(
                            new Office(
                                    random.nextInt(50000) + 1000,
                                    random.nextInt(10) + 1,
                                    "Business Center " + random.nextInt(100),
                                    random.nextInt(100) + 1
                            )
                    );
                    break;
            }
        }
        //сортировка по цене
        Collections.sort(realEstateList);

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите категорию поиска (1 - Flats, 2 - Houses, 3 - Offices):");
            int category = scan.nextInt();

            System.out.println("Введите минимальную цену:");
            Integer priceFrom = null;
            String priceFromStr = scan.next();
            if (!priceFromStr.isEmpty()) {
                priceFrom = Integer.parseInt(priceFromStr);
            }


            System.out.println("Введите максимальную цену:");
            Integer priceTo = null;
            String priceToStr = scan.next();
            if (!priceToStr.isEmpty()) {
                priceTo = Integer.parseInt(priceToStr);
            }

            // Поиск по цене

            System.out.println("Результат поиска:");
            for (RealEstate realEstate : realEstateList) {
                if ((realEstate instanceof Flat && category == 1
                        || realEstate instanceof House && category == 2 ||
                        realEstate instanceof Office && category == 3)
                        && (priceFrom == null || realEstate.getPrice() >= priceFrom)
                        && (priceTo == null || realEstate.getPrice() <= priceTo)) {
                    System.out.println(realEstate);
                }
            }
        }
    }
}