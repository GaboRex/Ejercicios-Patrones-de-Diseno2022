package EjercicioComposite.Ejercicio1;

    public abstract class Component {
        private int precio;
        private String tipo;

        public Component(String tipo) {
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }

        public Component setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public int getPrecio() {
            return precio;
        }

        public Component setPrecio(int precio) {
            this.precio = precio;
            return this;
        }

        public void showInfo(){
            System.out.println("Tipo de objeto: " + tipo);
            System.out.println("* Precio: " + precio + " $");
        }

        public abstract void mostrarDetalles();
        public abstract void add(Component component);
        public abstract void remove(Component component);
}
