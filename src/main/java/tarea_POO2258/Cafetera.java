package tarea_POO2258;

public class Cafetera {
    private int vasos;
    private int agua;
    private int cafe;
    private int crema;

    public Cafetera() {
        agua = 5000;
        cafe = 1000;
        crema = 1500;
        vasos = 50;
    }

    public Cafetera(int vasos, int agua, int cafe, int crema) {
        this.vasos = vasos;
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "vasos=" + vasos +
                ", agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                '}';
    }
    public void hacerAmericano(){
       if (this.agua >= 180 && this.cafe >= 15 && this.vasos >= 1){
           this.agua -= 180;
           this.cafe -= 15;
           this.vasos --;
           System.out.println("Se esta sirviendo tu cafe americano, un momento porfavor... ");
       } else {
           System.out.println("Ya no se puede servir mas cafe Americano. ");
       }
    }
    public void hacerExpreso(){
        if (this.agua >= 120 && this.cafe >= 20 && this.vasos >= 1){
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos --;
            System.out.println("Se esta sirviendo tu cafe Expreso, un momento porfavor... ");
        } else {
            System.out.println("Ya no se puede servir mas cafe Expreso. ");
        }
    }

    public void hacerCapuchino(){
        if (this.agua >= 100 && this.cafe >= 14 && this.crema >= 70 && this.vasos >= 1){
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos --;
            System.out.println("Se esta sirviendo tu cafe Capuchino, un momento porfavor... ");
        } else {
            System.out.println("Ya no se puede servir mas cafe Capuchino");
        }
    }
    public void recursos (){
        System.out.println("Recursos actuales: ");
        System.out.println("Agua: " + this.agua + "ml");
        System.out.println("Cafe: " + this.cafe + "g");
        System.out.println("Crema: " + this.crema + "ml");
        System.out.println("Vasos: " + this.vasos);
    }
}
