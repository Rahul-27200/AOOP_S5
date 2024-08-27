package com.onlineauction;

public class AuctionClient {
    public static void main(String[] args) {
        // Observer Pattern: Setting up auction and bidders
        Auction auction = new Auction();
        Bidder bidder1 = new ConcreteBidder("Alice");
        Bidder bidder2 = new ConcreteBidder("Bob");

        auction.subscribe(bidder1);
        auction.subscribe(bidder2);

        auction.setItem("Painting");

        // Template Pattern: Conducting different types of auctions
        AuctionProcess standardAuction = new StandardAuction();
        standardAuction.conductAuction("Painting");

        AuctionProcess reserveAuction = new ReserveAuction(1000);
        reserveAuction.conductAuction("Antique Vase");

        auction.startBidding();
        auction.endBidding();
    }
}
