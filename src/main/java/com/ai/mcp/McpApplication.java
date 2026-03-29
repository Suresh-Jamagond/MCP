package com.ai.mcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ai.mcp.service.MCPTools;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class McpApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpApplication.class, args);
	}

	@Bean
	public MCPTools mcpTools() {
		return new MCPTools();
	}

}
