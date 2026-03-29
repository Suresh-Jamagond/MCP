package com.ai.mcp.service;

import org.springaicommunity.mcp.annotation.McpTool;

public class MCPTools
{

    @McpTool(name = "check_status", description = "Get the current status of the Spring Boot AI Server and its version")
    public String getServerStatus()
    {
        return ("Server is UP. Version 1.0.SNAPSHOT. Java version" + System.getProperty("java.version"));
    }

    @McpTool(name = "analyze_code", description = "Calculate the complexity of a code snippet based on its length")
    public String analyzeComplexity(String code)
    {
        if (code.length() < 50) return "Low Complexity";
        if (code.length() < 200) return "Medium Complexity";
        return "High Complexity - Needs Review";
    }

}
