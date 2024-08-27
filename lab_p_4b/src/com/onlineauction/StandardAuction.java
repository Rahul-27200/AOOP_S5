package com.onlineauction;

public class StandardAuction extends AuctionProcess {
    @Override
    protected void startBidding() {
        System.out.println("Standard Auction: Bidding started.");
    }

    @Override
    protected void processBids() {
        System.out.println("Standard Auction: Processing bids.");
    }
}
