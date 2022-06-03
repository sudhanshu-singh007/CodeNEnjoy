package JavaExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

enum ApplianceType{
    FAN, LIGHT, TV;
}

interface AppliancePowerConsumption{
    int getConsumptionUnit();
}

class FanConsumption implements AppliancePowerConsumption{
    @Override
    public int getConsumptionUnit() {
        return 1;
    }
}

class LightConsumption implements AppliancePowerConsumption{
    @Override
    public int getConsumptionUnit() {
        return 2;
    }
}

class TVConsumption implements AppliancePowerConsumption{
    @Override
    public int getConsumptionUnit() {
        return 3;
    }
}

class PowerConsumptionFactory{
    public AppliancePowerConsumption switchOn(ApplianceType appliance)
    {
        switch (appliance){
            case FAN: return new FanConsumption();
            case LIGHT: return new LightConsumption();
            case TV: return new TVConsumption();

        }
        return null;
    }
}

class PowerConsumption
{
    static int totalConsumption=0;

    public static void main(String[] args)
    {
        PowerConsumptionFactory pcf = new PowerConsumptionFactory();
        System.out.print("Enter the Appliance type followed by number of appliances running. \n");

        try
        {
            for(int i=0; i<ApplianceType.values().length;i++)
            {
                System.out.print("Appliance: ");
                String applianceType = new Scanner(System.in).nextLine();
                System.out.print("Count: ");
                int applianceCount = new Scanner(System.in).nextInt();

                totalConsumption+= applianceCount*pcf.switchOn(ApplianceType.valueOf(applianceType.toUpperCase())).getConsumptionUnit();
            }

        }catch (IllegalArgumentException iae){
            System.out.println("Please choose from: FAN, TV, Light");
        }catch (InputMismatchException ime){
            System.out.println("Please enter valid number");
        }
        catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("Total Consumption="+totalConsumption+" units");
    }
}