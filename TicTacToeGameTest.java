import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TicTacToeGameTest {

    private TicTacToeGame game;
    private Board board;
    private int size = 4;
    private int choice = 1;

    @Before
    public void before() {
        TicTacToeGame mockedWindow = Mockito.mock(TicTacToeGame.class);
        game = new TicTacToeGame(size, choice);
    }


    @Test
    public void testCreationOfInstance(){
        TicTacToeGame mockedWindow = Mockito.mock(TicTacToeGame.class);
        Assert.assertNotNull(mockedWindow);
        mockedWindow.printBoardNxN();
        Mockito.verify(mockedWindow).printBoardNxN();
    }

    @Test
    public void testInvocationOfMethods(){
        TicTacToeGame mockedWindow = Mockito.mock(TicTacToeGame.class);
        mockedWindow.checkWinner();
        Assert.assertFalse(mockedWindow.checkWinner());
        verify(mockedWindow, times(2)).checkWinner();
        verify(mockedWindow,never()).firstPlays();
        verify(mockedWindow,never()).secondPlays();
    }

}
