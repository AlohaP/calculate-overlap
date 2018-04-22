class OverlapArea {

    private int rec1BotX;
    private int rec1BotY;
    private int rec1TopX;
    private int rec1TopY;
    private int rec2BotX;
    private int rec2BotY;
    private int rec2TopX;
    private int rec2TopY;

    OverlapArea(int rec1BotX, int rec1BotY, int rec1TopX, int rec1TopY, int rec2BotX, int rec2BotY, int rec2TopX, int rec2TopY) {
        this.rec1BotX = rec1BotX;
        this.rec1BotY = rec1BotY;
        this.rec1TopX = rec1TopX;
        this.rec1TopY = rec1TopY;
        this.rec2BotX = rec2BotX;
        this.rec2BotY = rec2BotY;
        this.rec2TopX = rec2TopX;
        this.rec2TopY = rec2TopY;
    }

    private int distance(int rec1BotXY, int rec1TopXY, int rec2BotXY, int rec2TopXY){
        return (Math.min(rec1TopXY, rec2TopXY) - Math.max(rec1BotXY, rec2BotXY));
    }

    int calculateOverlap() {
        int yDist = distance(rec1BotY, rec1TopY, rec2BotY, rec2TopY);

        if(yDist < 0){
            return 0;        }
        int xDist = distance(rec1BotX, rec1TopX, rec2BotX, rec2TopX);

        if( xDist < 0) {
            return 0;
        }
        return yDist * xDist;
    }
}
