package lotto.view;

import lotto.Statistic;
import lotto.domain.Player;
import lotto.domain.WinningLotto;

import java.util.List;

public class OutputView {

    public void printException(String message) {
        System.out.println(message);
    }

    public void printCount(int count) {
        System.out.println("\n" + count + "개를 구매했습니다.");
    }

    public void printLottos(List<Integer> nums) {
        System.out.println(nums);
    }

    public void printResult(WinningLotto winningLotto) {
        System.out.println("\n당첨 통계\n" + "---");
        System.out.println("3개 일치 (5,000원) - " + winningLotto.getMatch().get(Statistic.MATCH_THREE) + "개");
        System.out.println("4개 일치 (50,000원) - " + winningLotto.getMatch().get(Statistic.MATCH_FOUR) + "개");
        System.out.println("5개 일치 (1,500,000원) - " + winningLotto.getMatch().get(Statistic.MATCH_FIVE) + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + winningLotto.getMatch().get(Statistic.MATCH_FIVE_WITH_BONUS) + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + winningLotto.getMatch().get(Statistic.MATCH_SIX) + "개");
    }

    public void printTotal(Player player) {
        System.out.printf("총 수익률은 %.1f%%입니다.", player.getPercent());
    }
}
