package rocks.zipcodewilmington.tictactoe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 6/20/18.
 */
public class PlayerWinsColumn3Test {

    private Board board;

    @Before
    public void setup() {
        // Given
        this.board = new Board(new Character[][]{
                {'X', 'O', 'X'},
                {'O', ' ', 'X'},
                {' ', 'O', 'X'}
        });
    }

    @Test
    public void getWinnerTest() {
        // Given
        String expectedWinner = "X";

        // When
        String actualWinner = board.getWinner();

        // Then
        Assert.assertEquals(expectedWinner, actualWinner);
    }



    @Test
    public void isInFavorOfPlayerOTest() {
        // Given
        Boolean expected = false;

        // When
        Boolean actual = board.winnerO();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void isInFavorOfPlayerXTest() {
        // Given
        Boolean expected = true;

        // When
        Boolean actual = board.winnerX();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isTieTest() {
        // Given
        Boolean expected = false;

        // When
        Boolean actual = board.tie();

        // Then
        Assert.assertEquals(expected, actual);

    }
}

