package io.github.stefanbratanov.jvm.openai;

import java.util.List;

/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the
 * provided input.
 */
public record ChatCompletionChunk(
    String id,
    List<Choice> choices,
    long created,
    String model,
    String serviceTier,
    String systemFingerprint,
    Usage usage) {

  public record Choice(Delta delta, int index, Logprobs logprobs, String finishReason) {

    /** A chat completion delta generated by streamed model responses. */
    public record Delta(String role, String content, String refusal, List<ToolCall> toolCalls) {}
  }
}
