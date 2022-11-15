package lotto.DB;

import lotto.Model.Lotto;

import java.util.HashMap;
import java.util.List;

public class LottoData{
    public final int LOTTOPRICE = 1000;
    public enum LottoPrize{
        FIRSTPRIZE(2000000000),
        SECONDPRIZE(30000000),
        THRIDPRIZE(1500000),
        FOURTHPRIZE(50000),
        FIFTHPRIZE(5000);
        private final int value;
        LottoPrize(int value) {
            this.value = value;
        }
        public int getValue(){return value;}
    }
    private HashMap<Integer, Integer> numberOfWins = new HashMap<Integer, Integer>();
    private int countOfLotto;
    private List<Lotto> lottoList;
    private Lotto winnerNumber;

    private int bonusNumber;
    public void setCountOfLotto(int numberOfLotto){
        this.countOfLotto = numberOfLotto / LOTTOPRICE;
    }
    public void setNumberOfWins(HashMap<Integer, Integer> numberOfWins){this.numberOfWins = numberOfWins;}
    public HashMap<Integer, Integer> getNumberOfWins(){return numberOfWins;}
    public int getCountOfLotto(){
        return countOfLotto;
    }
    public void setLottoList(List<Lotto> lottoList){
        this.lottoList = lottoList;
    }

    public void setWinnerNumber(Lotto winnerNumber){
        this.winnerNumber = winnerNumber;
    }
    public Lotto getWinnerNumber(){return winnerNumber;}

    public void setBonusNumber(int bonusNumber){
        this.bonusNumber = bonusNumber;
    }
    public int getBonusNumber(){return bonusNumber;}
    public List<Lotto> getLottoList(){
        return lottoList;
    }
}