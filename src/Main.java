public class Main {

    /**
     * Edge flag indicating that the right edge should be affected.
     */
    public static final int EDGE_RIGHT = 1 << 1;

    /**
     * Edge flag indicating that the top edge should be affected.
     */
    public static final int EDGE_TOP = 1 << 2;

    /**
     * Edge flag indicating that the bottom edge should be affected.
     */
    public static final int EDGE_BOTTOM = 1 << 3;

    public static int mScrimColor = 0x99000000;

    public static void main(String[] args) {
        System.out.println("1 << 2 = " + EDGE_TOP);
        System.out.println("1 << 3 = " + EDGE_BOTTOM);
        final int baseAlpha = (mScrimColor & 0xff000000) >>> 24;
        System.out.println("alpha : " + baseAlpha);
        int a = 0xff000000 >>> 24;
        System.out.println(a);
    }
}
