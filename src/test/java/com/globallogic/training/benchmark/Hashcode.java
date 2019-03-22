package com.globallogic.training.benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.CompilerControl;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
public class Hashcode {

    @Param({"1", "10", "100000"})
    private String variable;


    private Integer intVal;
    private Long longVal;
    private String strVal;

    public static void runTests() throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(".*" + Hashcode.class.getSimpleName() + ".*")
                .build();
        new Runner(opt).run();
    }

    @Setup
    public void setup() {
        intVal = Integer.valueOf(variable);
        longVal = Long.valueOf(variable);
        strVal = variable;
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void intValBenchmark(MultiThreadingSampleBenchmark.BenchmarkState state, Blackhole bh) {
        int hashCode = intVal.hashCode();
        bh.consume(hashCode);
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void longValBenchmark(MultiThreadingSampleBenchmark.BenchmarkState state, Blackhole bh) {
        int hashCode = longVal.hashCode();
        bh.consume(hashCode);
    }

    @Benchmark
    @CompilerControl(CompilerControl.Mode.DONT_INLINE)
    public void strValBenchmark(MultiThreadingSampleBenchmark.BenchmarkState state, Blackhole bh) {
        int hashCode = strVal.hashCode();
        bh.consume(hashCode);
    }

}

