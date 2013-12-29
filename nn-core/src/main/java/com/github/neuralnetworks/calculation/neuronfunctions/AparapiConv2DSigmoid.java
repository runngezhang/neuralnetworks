package com.github.neuralnetworks.calculation.neuronfunctions;

/**
 * Sigmoid convolutional calculator
 */
public class AparapiConv2DSigmoid extends AparapiConv2D {

    private static final long serialVersionUID = -7985734201416578973L;

    @Override
    protected void after(int outputIndex) {
	output[outputIndex] = 1 / (1 + exp(-output[outputIndex]));
    }
}
