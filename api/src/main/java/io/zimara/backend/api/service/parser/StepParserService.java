package io.zimara.backend.api.service.parser;

import io.zimara.backend.model.step.Step;

import java.util.List;
/**
 * 🐱class StepParserService
 * 🐱relationship dependsOn Step
 *
 * Generic interface for all step parsers.
 *
 */
public interface StepParserService<T extends Step> {

    /*
     * 🐱method parse: List[Step]
     * 🐱param yaml: String
     *
     * Based on the YAML provided, offer a list of steps defined on it, if any
     */
    List<T> parse(String yaml);

    String getIdentifier();

    /*
     * 🐱method appliesTo: boolean
     * 🐱param yaml: String
     *
     * Check if this parser knows how to parse the provided string
     */
    boolean appliesTo(String yaml);

}
