# PROTOTYPE

## Overview
This microservice contains the code corresponding to Trade prototype

## Guidelines

## Considerations:
The code is generic and has not been implemented based on any specific event broker or persistence implementation.
Two use cases have been defined:
## Case 1:
- We receive a new instrument
- We add the instrument to our instrument repository
- We register it in the Market Depth service
## Case 2:
- We receive a buy event
- We lock the event so that there is only one processing. If event it´s already locked a Mono.Error is returned.
- We obtain the VWAP stored in our repository
- We recalculate by adding the new trade
- We publish to the VWAP broker
- We store the updated VWAP in our repository
   

