package com.onlineauction;

public class ReserveAuction extends AuctionProcess {
    private double reservePrice;

    public ReserveAuction(double reservePrice) {
        this.reservePrice = reservePrice;
    }

    @Override
    protected void startBidding() {
        System.out.println("Reserve Auction: Bidding started with reserve price: " + reservePrice);
    }

    @Override
    protected void processBids() {
        System.out.println("Reserve Auction: Processing bids with reserve price.");
    }
}
