public class TorredeHanoi {
    private int movimentos;

    public TorredeHanoi() {
        this.movimentos = 0;
    }

    public void resolverHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mova o disco 1 de " + origem + " para " + destino);
            movimentos++;
        } else {
            resolverHanoi(n - 1, origem, auxiliar, destino);
            System.out.println("Mova o disco " + n + " de " + origem + " para " + destino);
            movimentos++;
            resolverHanoi(n - 1, auxiliar, destino, origem);
        }
    }

    public int jogarTorreHanoi(int numDiscos) {
        movimentos = 0;
        resolverHanoi(numDiscos, 'A', 'C', 'B');
        return movimentos;
    }

    @Test
    public void testResolverHanoi() {
        TorreHanoi torreHanoi = new TorreHanoi();
        torreHanoi.resolverHanoi(3, 'A', 'C', 'B');
        assertEquals(7, torreHanoi.movimentos);
    }

    @Test
    public void testJogarTorreHanoi() {
        TorreHanoi torreHanoi = new TorreHanoi();
        int movimentos = torreHanoi.jogarTorreHanoi(4);
        assertEquals(15, movimentos);
    }
}
