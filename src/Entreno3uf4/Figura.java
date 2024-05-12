package Entreno3uf4;

public abstract class Figura {

        protected int base;
        protected int altura;

        public Figura(){

        }

        public Figura(int base, int altura){
            this.base=base;
            this.altura=altura;

        }
        public abstract double calcularArea();

        public int getBase(){
            return this.base;
        }
        public int getAltura(){
            return this.altura;
        }
        public void setBase(int base ){
            this.base=base;
        }
        public void setAltura(int altura){
            this.altura=altura;
        }
}
