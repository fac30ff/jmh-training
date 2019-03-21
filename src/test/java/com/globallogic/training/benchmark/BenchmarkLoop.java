package com.globallogic.training.benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
public class BenchmarkLoop {
    @Param({"10000000"})
    private int N;

    @Param({"114"})
    private int ABC;

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(BenchmarkLoop.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(opt).run();
    }

    @Benchmark
    public void HashCodeForString(Blackhole bh) {
        for (int i = 0; i < N; i++) {
            int i1 = String.valueOf(i).hashCode();
            bh.consume(i1);
        }
    }

    @Benchmark
    public void HashCodeForInteger(Blackhole bh) {
        for (int i = 0; i < N; i++) {
            int i1 = Integer.valueOf(i).hashCode();
            bh.consume(i1);
        }
    }

    @Benchmark
    public void HashCodeForLong(Blackhole bh) {
        for (int i = 0; i < N; i++) {
            int i1 = Long.valueOf(i).hashCode();
            bh.consume(i1);
        }
    }

    @Benchmark
    public void SwitchWithNaturalOrder(Blackhole bh) {
        for (int i = 65; i < ABC; i++) {
            char c = String.valueOf(i).charAt(0);
            switch (c) {
                case 'a':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'b':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'c':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'd':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'e':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'f':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'g':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'h':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'i':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'j':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'k':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'l':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'm':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'n':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'o':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'p':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'q':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'r':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 's':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 't':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'u':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'v':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'w':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'x':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'y':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'z':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                default:
                    System.out.println(c);
                    bh.consume(c);
                    break;
            }
        }
    }

    @Benchmark
    public void SwitchWithRandomOrder(Blackhole bh) {
        for (int i = 65; i < ABC; i++) {
            char c = String.valueOf(i).charAt(0);
            switch (c) {
                case 'Z':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'F':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'A':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'O':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'E':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'R':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'W':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'I':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'N':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'B':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'C':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'X':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'J':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'P':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'D':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'K':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'Y':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'M':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'G':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'U':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'S':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'V':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'Q':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'T':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'H':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                case 'L':
                    System.out.println(c);
                    bh.consume(c);
                    break;
                default:
                    System.out.println(c);
                    bh.consume(c);
                    break;
            }
        }
    }

}
