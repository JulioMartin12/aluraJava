public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenidos a Screen Match");
        System.out.println("Película: Matrix");
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = (8.2 + 6.0 + 9.0) / 3;

        System.out.println( String.format("%.2f",media));

        String sinopsis = """
                Matriz es una paradoja 
                La mejor película de fin de Milenio
                Fué lanzada en:
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);
        int clasificacion = (int) (media /2);
        System.out.println(clasificacion);
    }
}