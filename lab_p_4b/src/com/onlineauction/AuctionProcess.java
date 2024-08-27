package com.onlineauction;

public abstract class AuctionProcess {
    public final void conductAuction(String item) {
        prepareItem(item);
        startBidding();
        processBids();
        endBidding();
    }

    protected void prepareItem(String item) {
        System.out.println("Preparing item: " + item);
    }

    protected abstract void startBidding();
    
    protected abstract void processBids();

    protected void endBidding() {
        System.out.println("Ending the auction.");
    }
}
