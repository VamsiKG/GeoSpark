/**
 * FILE: SparkImageGenerator.java
 * PATH: org.datasyslab.babylon.extension.imageGenerator.SparkImageGenerator.java
 * Copyright (c) 2017 Arizona State University Data Systems Lab
 * All rights reserved.
 */
package org.datasyslab.babylon.extension.imageGenerator;

import java.awt.image.BufferedImage;
import java.util.List;

import org.apache.spark.api.java.JavaPairRDD;
import org.datasyslab.babylon.core.ImageGenerator;
import org.datasyslab.babylon.utils.ImageType;

/**
 * The Class SparkImageGenerator.
 */
public class SparkImageGenerator extends ImageGenerator{

	/* (non-Javadoc)
	 * @see org.datasyslab.babylon.core.ImageGenerator#SaveAsFile(org.apache.spark.api.java.JavaPairRDD, java.lang.String)
	 */
	@Override
	public boolean SaveAsFile(JavaPairRDD distributedPixelImage, String outputPath, ImageType imageType)
	{
		if(imageType.getTypeName().equalsIgnoreCase("svg"))
		{
			distributedPixelImage.saveAsTextFile(outputPath);
		}
		else
		{
			distributedPixelImage.saveAsObjectFile(outputPath);
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see org.datasyslab.babylon.core.ImageGenerator#SaveAsFile(java.awt.image.BufferedImage, java.lang.String)
	 */
	@Override
	public boolean SaveAsFile(BufferedImage pixelImage, String outputPath, ImageType imageType) throws Exception {
		throw new Exception("[SparkImageGenerator][SaveAsFile] This method hasn't been implemented yet.");
	}

	/* (non-Javadoc)
	 * @see org.datasyslab.babylon.core.ImageGenerator#SaveAsFile(java.util.List, java.lang.String, org.datasyslab.babylon.utils.ImageType)
	 */
	@Override
	public boolean SaveAsFile(List<String> vectorImage, String outputPath, ImageType imageType) throws Exception {
		throw new Exception("[SparkImageGenerator][SaveAsFile] This method hasn't been implemented yet.");
	}


}
