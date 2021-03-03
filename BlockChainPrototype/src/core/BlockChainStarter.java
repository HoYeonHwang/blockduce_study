package core;

import Util.Util;

import java.util.ArrayList;

public class BlockChainStarter {
    public static void main(String[] args) {
        Transaction transaction = new Transaction("황호연","류건희",1.5);
        System.out.println(transaction.getInformation());

        Block block1 = new Block(1,null,0, new ArrayList());
        block1.mine();
        block1.getInformation();

        Block block2 = new Block(2, block1.getBlockHash(), 0, new ArrayList());
        block2.addTransaction(new Transaction("황호연","류건희",1.5));
        block2.addTransaction(new Transaction("황영준","류건희",0.7));
        block2.mine();
        block2.getInformation();

        Block block3 = new Block(3, block2.getBlockHash(), 0, new ArrayList());
        block3.addTransaction(new Transaction("황호연","황영준",8.2));
        block3.addTransaction(new Transaction("류건희","황호연",0.4));
        block3.mine();
        block3.getInformation();

        Block block4 = new Block(4, block3.getBlockHash(), 0, new ArrayList());
        block4.addTransaction(new Transaction("류건희","황영준",0.1));
        block4.mine();
        block4.getInformation();

    }
}
