import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MainTest {

    private Main main;
    private TicTacToeGame game;
    private Board board;
    private int size = 4;
    private int choice = 1;

    @Before
    public void before() {
        Main mockedMain = Mockito.mock(Main.class);
        TicTacToeGame mockedGame = Mockito.mock(TicTacToeGame.class);
    }

    @Test
    public void create() {
        this.main = new Main();
        this.game = new TicTacToeGame(size, choice);

        Main mockedMain = Mockito.spy(Main.class);
        TicTacToeGame mockedGame = Mockito.mock(TicTacToeGame.class);
        mockedGame.printBoardNxN();
        //mockedMain.main(new String[] {"arg1", "arg2", "arg3"});
        //verify(mockedMain, times(1)).main(new String[] {"arg1", "arg2", "arg3"});

        InOrder inOrder = Mockito.inOrder(mockedMain);
        inOrder.verify(mockedMain).main(new String[] {"arg1", "arg2", "arg3"});;
    }


}
