package pl.edu.pw.wsd.agency.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import javafx.geometry.Point2D;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author apapros
 */
// FIXME :: uzywamy zamiast Point2D
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhisicalDeviceLocation {

    @JsonProperty
    private double x;
    @JsonProperty
    private double y;
    @JsonProperty("signal_range")
    private double signalRange;

    public double distance(double x1, double y1) {
        double a = getX() - x1;
        double b = getY() - y1;
        return Math.sqrt(a * a + b * b);
    }

    public double distance(PhisicalDeviceLocation other) {
        return distance(other.getX(), other.getY());
    }

    public Point2D toPoint2D() {
        return new Point2D(x, y);
    }
}
