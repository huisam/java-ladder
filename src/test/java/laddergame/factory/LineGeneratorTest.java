package laddergame.factory;

import laddergame.controller.rule.AlwaysCreateRule;
import laddergame.domain.Line;
import laddergame.domain.Point;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LineGeneratorTest {
    @Test
    void Line이_제대로_생성되는지_테스트() {
        assertThat(LineGenerator.lineGenerate(new AlwaysCreateRule(), 2)).isEqualTo(
                new Line(Arrays.asList(Point.RIGHT, Point.LEFT)));
    }
}