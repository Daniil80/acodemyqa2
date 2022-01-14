package homeWork;

import java.security.spec.RSAOtherPrimeInfo;

public class PrimTypHomeWork {
    public static void main(String[] args) {

//  byte examples:
        System.out.println("Byte examples:");
        byte wheelCount = 4;
        System.out.println(wheelCount + " wheels");
        byte waterStates = 3;
        System.out.println(waterStates + " water states: liquid, gas, solid");
        byte fingerCount = 20;
        System.out.println(fingerCount + " - finger quantity +/- :alien: ;))");
        byte yearSeason = 4;
        System.out.println(yearSeason + " year seasons");
        byte hydrogenAtomsInWaterMolecule = 2;
        System.out.println(hydrogenAtomsInWaterMolecule + " - hydrogen atoms count in H2O");
        byte oxygenAtomsInWaterMolecule = 1;
        System.out.println(oxygenAtomsInWaterMolecule + " - oxygen atoms count in H2O");
        byte waterBoilsTemperatureInCelsius = 100;
        System.out.println(waterBoilsTemperatureInCelsius + " degrees in celsius water boils");
        byte waterMeldingTemperatureInCelsius = 0;
        System.out.println(waterMeldingTemperatureInCelsius + " - degree in celsius ice melds");
        byte minutesIn1Hour = 60;
        System.out.println(minutesIn1Hour + " - minutes in 1 hour");
        byte hoursInADay = 24;
        System.out.println(hoursInADay + " - hours in a day");
        System.out.println("Byte min: " + Byte.MIN_VALUE);
        System.out.println("Byte max: " + Byte.MAX_VALUE);
        System.out.println(" ");

//  short examples:

        System.out.println("Short examples:");
        short weightT28Tank = 25400;
        System.out.println(weightT28Tank + " kilograms - weight of the T-28 soviet tank");
        short manufacturedT28 = 503;
        System.out.println(manufacturedT28 + " T-28 tanks were manufactured");
        short weightT34Tank = 26500;
        System.out.println(weightT34Tank + " kilograms - weight of the T-34 soviet tank");
        short weightT3485tank = 32000;
        System.out.println(weightT3485tank + " kilograms - weight of the T-34-85 soviet tank");
        short totalManufacturedT3485 = 30579;
        System.out.println(totalManufacturedT3485 + " T-34-85 tanks total were manufactured");
        short weightM41WalkerBulldogTank = 23200;
        System.out.println(weightM41WalkerBulldogTank + " kilograms - weight of the M41 Walker Bulldog tank");
        short manufacturedM41WalkerBulldogTanks = 3729;
        System.out.println(manufacturedM41WalkerBulldogTanks + " M41 Walker Bulldog tanks were manufactured");
        short weightLightTankM24Chaffee = 18000;
        System.out.println(weightLightTankM24Chaffee + " kilograms - weight of the Light tank M24 Chaffee");
        short manufacturedM24Chaffee = 4731;
        System.out.println(manufacturedM24Chaffee + " M24 Chaffee were manufactured");
        short weightLightTankM3Stuart = 12700;
        System.out.println(weightLightTankM3Stuart + " kilograms - weight of the Light tank M3 Stuart");
        short totalManufacturedM3Stuart = 22743;
        System.out.println(totalManufacturedM3Stuart + " M3 Stuart Light tanks total were manufactured");
        System.out.println("Short min: " + Short.MIN_VALUE);
        System.out.println("Short max: " + Short.MAX_VALUE);
        System.out.println(" ");

//  int examples:

        System.out.println("int examples:");
        int manufacturedT34Tanks = 35330;
        System.out.println(manufacturedT34Tanks + " T-34 tanks were manufactured");
        int titanicWeight = 52310;
        System.out.println(titanicWeight + " weight of the titanic ship in tonnes");
        int lobsterBrainNeurons = 100000;
        System.out.println(lobsterBrainNeurons + " - lobster neurons quantity");
        int beeBrainNeurons = 960000;
        System.out.println(beeBrainNeurons + " - bee neurons quantity");
        int octopusBrainNeurons = 500_000_000;
        System.out.println(octopusBrainNeurons + " - octopus brain neurons quantity");
        int catBrainNeurons = 760_000_000;
        System.out.println(catBrainNeurons + " - cat brain neurons quantity");
        int eurasianJayBrainNeurons = 1_085_000_000;
        System.out.println(eurasianJayBrainNeurons + " - eurasian jay brain neurons quantity");
        int emuBrainNeurons = 1_335_000_000;
        System.out.println(emuBrainNeurons + " - emu brain neurons quantity");
        int greyParrotBrainNeurons = 1_566_000_000;
        System.out.println(greyParrotBrainNeurons + " - grey parrot brain neurons quantity");
        int cockatooBrainNeurons = 2_122_000_000;
        System.out.println(cockatooBrainNeurons + " - cockatoo brain neurons quantity");
        System.out.println("int min: " + Integer.MIN_VALUE);
        System.out.println("int max: " + Integer.MAX_VALUE);
        System.out.println(" ");

//  long examples:

        System.out.println("long examples");
        long raccoonBrainNeurons = 2_148_000_000L;
        System.out.println(raccoonBrainNeurons + " - raccoon brain neurons quantity");
        long ravenBrainNeurons = 2_171_000_000L;
        System.out.println(ravenBrainNeurons + " - common raven brain neurons quantity");
        long pigBrainNeurons = 2_220_000_000L;
        System.out.println(pigBrainNeurons + " - pig brain neurons quantity");
        long dogBrainNeurons = 2_253_000_000L;
        System.out.println(dogBrainNeurons + " - dog brain neurons quantity");
        long macawBrainNeurons = 3_136_000_000L;
        System.out.println(macawBrainNeurons + " - blue-and-yellow macaw brain neurons quantity");
        long capuchinBrainNeurons = 3_691_000_000L;
        System.out.println(capuchinBrainNeurons + " - tufted capuchin brain neurons quantity");
        long brownBearBrainNeurons = 9_586_000_000L;
        System.out.println(brownBearBrainNeurons + " - brown bear brain neurons quantity");
        long giraffeBrainNeurons = 10_750_000_000L;
        System.out.println(giraffeBrainNeurons + " - giraffe brain neurons quantity");
        long orangutanBrainNeurons = 32_600_000_000L;
        System.out.println(orangutanBrainNeurons + " - orangutan brain neurons quantity");
        long humanBrainNeurons = 86_000_000_000L;
        System.out.println(humanBrainNeurons + " - homo sapiens brain neurons quantity");
        System.out.println("long min: " + Long.MIN_VALUE);
        System.out.println("long max: " + Long.MAX_VALUE);
        System.out.println( );

//  float examples:

        System.out.println("float examples");
        float thermCondClay = 0.600F;
        System.out.println(thermCondClay + " - thermal conductivity of clay at 20 degrees in W/(m.K)");
        float thermCondBrick = 0.720F;
        System.out.println(thermCondBrick + " - thermal conductivity of brick at 20 degrees in W/(m.K)");
        float thermCondGlass = 0.935F;
        System.out.println(thermCondGlass + " - thermal conductivity of glass at 20 degrees in W/(m.K)");
        float thermCondWood = 0.170F;
        System.out.println(thermCondWood + " - thermal conductivity of wood at 20 degrees in W/(m.K)");
        float thermCondCork = 0.043F;
        System.out.println(thermCondCork + " - thermal conductivity of cork at 20 degrees in W/(m.K)");
        float thermCondRockwool = 0.034F;
        System.out.println(thermCondRockwool + " - thermal conductivity of Rockwool at 20 degrees in W/(m.K)");
        float thermCondDiamond = 2.300F;
        System.out.println(thermCondDiamond + " - thermal conductivity of Diamond at 20 degrees in W/(m.K)");
        float thermCondAcetone = 0.170F;
        System.out.println(thermCondAcetone + " - thermal conductivity of acetone at 20 degrees in W/(m.K)");
        float thermCondMercury = 8.54F;
        System.out.println(thermCondMercury + " - thermal conductivity of mercury at 20 degrees in W/(m.K)");
        float thermCondWater = 0.613F;
        System.out.println(thermCondWater + " - thermal conductivity of water at 20 degrees in W/(m.K)");
        System.out.println("float min: " + Float.MIN_VALUE);
        System.out.println("float max: " + Float.MAX_VALUE);
        System.out.println( );

//  double examples:

        System.out.println("double examples");
        double currencyExchRatesAUD = 1.570900D;
        System.out.println(currencyExchRatesAUD + " - AUD exchange rate 13.01.2022 for 1 EUR");
        double currencyExchRatesCAD = 1.430400D;
        System.out.println(currencyExchRatesCAD + " - CAD exchange rate 13.01.2022 for 1 EUR");
        double currencyExchRatesCHF = 1.045300D;
        System.out.println(currencyExchRatesCHF + " - CHF exchange rate 13.01.2022 for 1 EUR");
        double currencyExchRatesGBP = 0.835450D;
        System.out.println(currencyExchRatesGBP + " - GBP exchange rate 13.01.2022 for 1 EUR");
        double currencyExchRatesHKD = 8.928900D;
        System.out.println(currencyExchRatesHKD + " - HKD exchange rate 14.01.2022 for 1 EUR");
        double currencyExchRatesJPY = 130.980000D;
        System.out.println(currencyExchRatesJPY + " - JPY exchange rate 14.01.2022 for 1 EUR");
        double currencyExchRatesPLN = 4.536100D;
        System.out.println(currencyExchRatesPLN + " - PLN exchange rate 14.01.2022 for 1 EUR");
        double currencyExchRatesRUB = 86.603000D;
        System.out.println(currencyExchRatesRUB + " - RUB exchange rate 14.01.2022 for 1 EUR");
        double currencyExchRatesSEK = 10.238000D;
        System.out.println(currencyExchRatesSEK + " - SEK exchange rate 14.01.2022 for 1 EUR");
        double currencyExchRatesUSD = 1.146300D;
        System.out.println(currencyExchRatesGBP + " - USD exchange rate 14.01.2022 for 1 EUR");
        System.out.println("double min: " + Double.MIN_VALUE);
        System.out.println("double max: " + Double.MAX_VALUE);
        System.out.println( );

//  Arithmetic:

        System.out.println("arithmetics examples");
        float a1 = 0.54F;
        float b1 = 0.72F;

        int a2 = 45;
        float b2 = 41.28F;

        float c1 = a1 + b1;
        System.out.println("0.54 + 0.72 = " + c1);
        float c2 = a2 + b2;
        System.out.println("45 + 41.28 = " + c2);
        float c3 = a1 - b1;
        System.out.println("0.54 - 0.72 = " + c3);
        float c4 = a2 - b2;
        System.out.println("45 - 41.28 = " + c4 + " нипоняяятна! о_О =)))))");
        float c5 = a1 * b1;
        System.out.println("0.54 * 0.72 = " + c1);
        float c6 = a2 * b2;
        System.out.println("45 * 41.28 = " + c6);
        float c7 = a1 / b1;
        System.out.println("0.54 / 0.72 = " + c7);
        float c8 = a2 / b2;
        System.out.println("45 / 41.28 = " + c8);
        float c9 = (a1 + b2) / (a2 - b1);
        System.out.println("(0.54 + 41.28) / (45 - 0.72) = " + c9);

        int a = 8;
        int b = a++;
        int c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        System.out.println( );

//  string examples:

        System.out.println("string examples:");
        String str1 = "Hello, ";
        String str2 = new String(new char[] {'M', 'y', ' ', 'n', 'a', 'm', 'e', ' ', 'i', 's', ' '});
        String str3 = new String(new char[] {'D', 'a', 'n', 'i', 'i', 'l', ' '});
        String str4 = new String(new char[]{'w', 'G', 'a', 'l', 'u', 'z', 'a', 'r'}, 1, 6);
        //1 -first index, 6 -symbols quantity
        System.out.print(str1);
        System.out.print(str2);
        System.out.print(str3);
        System.out.print(str4);


//        5 Напишите одно предложение (по возможности длинное) о себе в виде
//        комментария. Далее каждое слово присвойте к новой
//        переменной и распечатайте предложение в одной строке.

//        a Пример: My name is Nikita.
//        b String firstPart = “My name is”;
//        c String name = “Nikita”;
//        d System.out.println(firstPart + “ “ + name);
//        i Используйте так-же System.out.printf (формат)
//  Hello, my name is Daniil, I live in Riga, I like watching movies, walking, studying IT.
//
        System.out.println( );
        String str5 = "Hello";
        String str6 = ", ";
        String str7 = "my ";
        String str8 = "name ";
        String str9 = "is ";
        String str10 = "Daniil ";
        String str11 = "I ";
        String str12 = "live ";
        String str13 = "in ";
        String str14 = "Riga, ";
        String str15 = "I ";
        String str16 = "like ";
        String str17 = "watching ";
        String str18 = "movies, ";
        String str19 = "walking, ";
        String str20 = "studying IT.";
        System.out.print(str5 + str6 + str7 + str8 + str9 + str10 + str11 + str12 + str13 + str14 + str15 + str16 + str17 + str18 + str19 + str20);

        String firstName = "Daniil";
        String lastName = "Galuza";
        int age = 41;

        System.out.println( );
        System.out.printf("My name is %s %s, I'm %d years old.", firstName, lastName, age);




    }
}
