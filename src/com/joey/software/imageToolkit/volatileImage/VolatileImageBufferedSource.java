/*******************************************************************************
 * Copyright (c) 2012 joey.enfield.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     joey.enfield - initial API and implementation
 ******************************************************************************/
package com.joey.software.imageToolkit.volatileImage;

import java.awt.image.BufferedImage;
import java.awt.image.VolatileImage;

public class VolatileImageBufferedSource implements VolatileImageDataSource
{
	BufferedImage image;

	public VolatileImageBufferedSource(BufferedImage img)
	{
		setImage(img);
	}

	@Override
	public VolatileImage getImageData()
	{
		// TODO Auto-generated method stub
		return VolatileImageToolkit.convert(image);
	}

	public BufferedImage getImage()
	{
		return image;
	}

	public void setImage(BufferedImage image)
	{
		this.image = image;
	}

}
