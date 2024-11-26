package GPS;

import java.awt.*;

public class drawLion extends Canvas {
    private Color colorL;
    private Locate locate;
    private Lion lion;
    private Point lionP;

    public drawLion(Lion lion) {
        this.lion = lion;
        colorL = Color.RED;
        lionP = locate.getLionLocation(lion.getTagID());

    }
    public void draw(Graphics g) {
        g.setColor(colorL);
        g.drawOval(lionP.x, lionP.y, 3, 3);
        g.drawString(lion.getName(),lionP.x+5,lionP.y+5);
        g.drawString(String.valueOf(lion.getAge()),lionP.x+5,lionP.y+7);
    }

}