import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PlayerTest {

    private Player player;

    @Before
    public void setUp(){
        Player player = Mockito.mock(Player.class);

    }
    @Test
    void playerPlays() {
        Player mockedPlayer = Mockito.mock(Player.class);
        verifyNoInteractions(mockedPlayer);
    }
}
