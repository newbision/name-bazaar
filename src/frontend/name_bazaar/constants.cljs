(ns name-bazaar.constants)

(def contracts-version "1.0.0")

(def contracts-method-args
  {:instant-buy-offering-factory/create-offering [:instant-buy-offering-factory/name
                                                  :instant-buy-offering-factory/price]
   :english-auction-offering-factory/create-offering [:english-auction-offering-factory/name
                                                      :english-auction-offering-factory/start-price
                                                      :english-auction-offering-factory/start-time
                                                      :english-auction-offering-factory/end-time
                                                      :english-auction-offering-factory/extension-duration
                                                      :english-auction-offering-factory/extension-trigger-duration
                                                      :english-auction-offering-factory/min-bid-increase]
   :ens/set-owner [:ens/node :ens/owner]})

(def contracts-method-wei-args #{:instant-buy-offering-factory/price
                                 :english-auction-offering-factory/start-price
                                 :english-auction-offering-factory/min-bid-increase})

(def library-placeholders
  {:offering-library "__OfferingLibrary.sol:OfferingLibrary___"
   :instant-buy-offering-library "__instant_buy/InstantBuyOfferingLibrar__"
   :english-auction-offering-library "__english_auction/EnglishAuctionOfferi__"})