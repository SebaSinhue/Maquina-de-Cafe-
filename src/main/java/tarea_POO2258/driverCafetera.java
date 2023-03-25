package tarea_POO2258;

public class driverCafetera {
    public static void main(String[] args) {
        Cafetera machineCoffee = new Cafetera();
        boolean hay_recursos = true;
        while (hay_recursos) {
            machineCoffee.hacerAmericano();
            machineCoffee.hacerExpreso();
            machineCoffee.hacerCapuchino();
            machineCoffee.recursos();
            hay_recursos = (machineCoffee.getAgua() >= 180 && machineCoffee.getCafe() >= 20 && machineCoffee.getCrema() >= 70 && machineCoffee.getVasos() >= 1);
        }
        System.out.println("Ya no hay suficientes recursos para seguir sirviendo cafe. ");
    }
}
