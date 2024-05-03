package io.github.stefanbratanov.jvm.openai;

import java.util.Map;

public record VectorStore(
    String id,
    long createdAt,
    String name,
    long usageBytes,
    FileCounts fileCounts,
    String status,
    ExpiresAfter expiresAfter,
    Long expiresAt,
    Long lastActiveAt,
    Map<String, String> metadata) {

  public record FileCounts(int inProgress, int completed, int cancelled, int failed, int total) {}
}
