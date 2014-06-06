package com.vikingbrain.nmt.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for the class UtilFile.
 * 
 * @author vikingBrain
 */
public class UtilFileTest {

	@Test
	public void getFileAbsoluteUriTest(){
		String filePath1 = "/opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/02.mp3";
		String filePath2 = "file:///opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/02.mp3";
		
		Assert.assertEquals(filePath2, UtilFile.getFileAbsoluteUri(filePath1));
		Assert.assertEquals(filePath2, UtilFile.getFileAbsoluteUri(filePath2));
	}

	@Test
	public void getFileNameTest(){
		String expectedFileName = "02.mp3";
		
		String filePath1 = "/opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/02.mp3";
		String filePath2 = "file:///opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/02.mp3";
		
		Assert.assertEquals(expectedFileName, UtilFile.getFileName(filePath1));
		Assert.assertEquals(expectedFileName, UtilFile.getFileName(filePath2));
		
		//folder path test case
		expectedFileName = "";
		Assert.assertEquals(expectedFileName, UtilFile.getFileName("/SATA_DISK/ztesting/"));
		
		//file without extension test case
		expectedFileName = "ztesting";
		Assert.assertEquals(expectedFileName, UtilFile.getFileName("/SATA_DISK/ztesting"));
	}


	@Test
	public void getNmtAbsolutePathTest(){
		String expectedAbsolutePath = "/opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/02.mp3";
		
		String filePath1 = "/opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/02.mp3";
		String filePath2 = "file:///opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/02.mp3";
		
		Assert.assertEquals(expectedAbsolutePath, UtilFile.getNmtAbsolutePath(filePath1));
		Assert.assertEquals(expectedAbsolutePath, UtilFile.getNmtAbsolutePath(filePath2));
	}

	@Test
	public void isAbsolutePathsEqualTest(){
		String path1 = "02";
		String path2 = "sample";		
		Assert.assertTrue(UtilFile.isAbsolutePathsEqual(path1, path1));
		Assert.assertFalse(UtilFile.isAbsolutePathsEqual(path1, path2));
		
		path1 = "/opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/02.mp3";
		path2 = "file:///opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/02.mp3";
		Assert.assertTrue(UtilFile.isAbsolutePathsEqual(path1, path2));
		
		path1 = "/opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/02.mp3";
		path2 = "/opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/sample.mkv";
		Assert.assertFalse(UtilFile.isAbsolutePathsEqual(path1, path2));

		path1 = "/ztesting/02.mp3";
		path2 = "/ztesting_samples/sample.mkv";
		Assert.assertFalse(UtilFile.isAbsolutePathsEqual(path1, path2));
	}
	
	@Test
	public void getExtensionTest(){
		String testPath = null;
		Assert.assertNull(UtilFile.getExtension(testPath));
		
		testPath = "02";
		Assert.assertEquals("", UtilFile.getExtension(testPath));
		
		testPath = "02.mp3";
		Assert.assertEquals(".mp3", UtilFile.getExtension(testPath));

		testPath = "/opt/sybhttpd/localhost.drives/SATA_DISK/ztesting/sample.mkv";
		Assert.assertEquals(".mkv", UtilFile.getExtension(testPath));

		testPath = ".";
		Assert.assertEquals(".", UtilFile.getExtension(testPath));
	}
	
}
