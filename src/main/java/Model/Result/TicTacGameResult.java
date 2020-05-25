package Model.Result;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;

public class TicTacGameResult {
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Long id;

    /**
     * The names of the players.
     */

    @Column(nullable = false)
    private String player1;

    @Column(nullable = false)
    private String player2;

    /**
     * The duration of the game.
     */
    @Column(nullable = false)
    private Integer score;

    private String winner;
    private ZonedDateTime created;

    protected void onPersist() {
        created = ZonedDateTime.now();
    }
}
