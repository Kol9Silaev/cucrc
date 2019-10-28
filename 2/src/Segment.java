public class Segment {

    private double x1,x2,y1,y2;

    Segment(double x1,double x2,double y1,double y2)
    {
        if (x1 > x2)
        {
            this.x1 = x2;
            this.x2 = x1;
            this.y1 = y2;
            this.y2 = y1;
        }
        else {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }

    }

   private boolean isVertical(Segment point)
    {
            if (x1 == point.x1) {

                if (!((Math.max(y1, y2) < Math.min(point.y1, point.y2)) ||
                        (Math.min(y1, y2) > Math.max(point.y1, point.y2)))) {

                    return true;
                }
            }

        return false;
    }

    private boolean isVerticalFirstSegment(Segment point)
    {
            double x = x1;
            double a = (point.y1 - point.y2) / (point.x1 - point.x2);
            double b = point.y1 - a * point.x1;
            double y = a * x + b;

            if (point.x1 <= x && point.x2 >= x && Math.min(y1, y2) <= y &&
                    Math.max(y1, y2) >= y) {

                return true;
            }
        return false;
    }

    private boolean isVerticalSecondSegment(Segment point)
    {
            double x = point.x1;
            double a = (y1 - y2) / (x1 - x2);
            double b = y1 - a * x1;
            double y = a * x + b;

            if (x1 <= x && x2 >= x && Math.min(point.y1, point.y2) <= y &&
                    Math.max(point.y1, point.y2) >= y) {

                return true;
            }
        return false;
    }

    private boolean isGeneral(Segment point)
    {
        double a1 = (x2 - x1)/(y2 - y1);
        double a2 = (point.x2 - point.x1)/(point.y2 - point.y1);
        double b1 = y1 - a1 * x1;
        double b2 = point.y1 - a2 * point.x1;

        double x = (b2 - b1) / (a1 - a2);

        return (!(x < Math.max(x1, point.x1))) && (!(x > Math.min(x2, point.x2)));
    }



    boolean isIntersection(Segment point)
    {
        if ((x1 - x2 == 0) && (point.x1 - point.x2 == 0)) return isVertical(point);
        if (x1 - x2 == 0) return isVerticalFirstSegment(point);
        if (point.x1 - point.x2 == 0) return isVerticalSecondSegment(point);
        else return isGeneral(point);
    }
}
