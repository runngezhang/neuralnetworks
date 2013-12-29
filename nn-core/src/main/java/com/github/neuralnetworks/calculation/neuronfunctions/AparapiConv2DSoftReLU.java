package com.github.neuralnetworks.calculation.neuronfunctions;

/**
 * Soft ReLU convolutional calculator
 */
public class AparapiConv2DSoftReLU extends AparapiConv2D {

    private static final long serialVersionUID = -7985734201416578973L;

    @Override
    protected void after(int outputIndex) {
	output[outputIndex] = log(1 + exp(output[outputIndex]));
    }
}
