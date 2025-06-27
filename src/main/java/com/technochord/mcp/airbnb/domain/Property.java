package com.technochord.mcp.airbnb.domain;

import org.springframework.ai.tool.annotation.ToolParam;

import java.util.List;

//TODO: ToolParams dont really have a place here because they are not input.
//How does the LLM interpret the response?
public record Property(@ToolParam(required = true, description = "The Id of the property") String id,
                       @ToolParam(required = true, description = "The address of the property") String address,
                       @ToolParam(required = true, description = "The number of bedrooms in the property") int numberBedrooms,
                       @ToolParam(required = true, description = "The number of bathrooms in the property") int numberBathrooms,
                       @ToolParam(required = true, description = "The number of adults and children that it can house") int capacity,
                       @ToolParam(required = false, description = "The ameneties in the room or property") List<String> amenetiesList,
                       @ToolParam(required = true, description = "The rent per day of stay in USD") double rentPerNight) {
}
