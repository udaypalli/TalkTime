
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `discussion_forum`
--
create database talktime;
use talktime;

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `category_id` int(8) NOT NULL,
  `category_name` varchar(255) NOT NULL,
  `category_description` varchar(255) NOT NULL,
  `created` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Inserting data for table `categories`
--

INSERT INTO `categories` (`category_id`, `category_name`, `category_description`, `created`) VALUES
(1, 'Programming', 'Programming is the process of creating a set of instructions that tell a computer how to perform a task. Programming can be done using a variety of computer programming languages, such as JavaScript, Python, and C++.', '2022-10-12 11:53:06'),
(2, 'Treading', 'A trending topic is a subject that experiences a surge in popularity on one or more social media platforms for a limited duration of time or Widely mentioned or discussed on the internet, especially on social media websites:', '2022-10-12 11:53:43'),
(3, 'Sports', 'Sports are popular for a number of reasons. Keeping healthy, for example, is often cited as a reason for participating in sports. Others will tell you that they do sports for recreational purposes. Sports are even more popular with people who do not necessarily participate in them, but love being spectators', '2022-10-12 11:55:37'),
(4, 'Business', 'A business is a concept that can be used for financial gain that is usually centered on a product or service that can be offered for money. An idea is the base of the pyramid when it comes to the business as a whole.', '2022-10-12 12:57:08'),
(5, 'Social Platforms', 'With new apps popping up every day, it can be a challenge to figure out which social media platforms will be most valuable for investing your time and money. Should you go all in on industry stalwarts like Instagram and Facebook? Or should you target younger audiences who consistently use Snapchat and Tiktok?', '2022-10-12 10:47:25'),
(6, 'Health', 'Health is important to live life to the fullest. When a person leads a healthy lifestyle, the body remains healthy and the mind is active and fresh. Living a healthy life would extend longevity and also regenerate the body and mind. Having good health is of core importance to human happiness', '2022-10-12 10:47:49'),
(7, 'Politics', 'Government and Politics is a fantastic A Level that has shown us just how great an influence Politics has on us and has broken the illusion that we are disconnected from it.', '2022-10-12 10:48:16'),
(8, 'Nature', 'Survival of mankind without nature is impossible and humans need to understand that. If nature has the ability to protect us, it is also powerful enough to destroy the entire mankind. Every form of nature, for instance, the plants, animals, rivers, mountains, moon, and more holds equal significance for us', '2022-10-12 10:48:50'),
(9, 'Others', 'Other queries ask anything in this category', '2022-10-12 10:49:18');

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `comment_id` int(8) NOT NULL,
  `comment_content` text NOT NULL,
  `thread_id` int(8) NOT NULL,
  `comment_by` int(11) NOT NULL,
  `comment_time` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `contacts`
--

CREATE TABLE `contacts` (
  `sno` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `topic` varchar(255) NOT NULL,
  `problem` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `dt` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `threads`
--

CREATE TABLE `threads` (
  `thread_id` int(11) NOT NULL,
  `thread_title` varchar(255) NOT NULL,
  `thread_desc` text NOT NULL,
  `thread_cat_id` int(11) NOT NULL,
  `thread_user_id` int(11) NOT NULL,
  `timestamp` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `sno` int(8) NOT NULL,
  `user_email` varchar(30) NOT NULL,
  `user_pass` varchar(255) NOT NULL,
  `timestamp` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Inserting data for table `users`
--

INSERT INTO `users` (`sno`, `user_email`, `user_pass`, `timestamp`) VALUES
(1, 'pavan', 'pavan@123', '2022-10-12 12:11:30'),
(2, 'uday', 'uday@123', '2022-10-12 12:01:09'),
(3, 'admin', 'admin@123', '2022-10-12 12:11:30');

-- --------------------------------------------------------
--
-- Table structure for profiles
--
CREATE TABLE `profiles` (
  `user_name` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `email` varchar(255) NOT NULL,
  `dt` datetime DEFAULT current_timestamp(),
  `contact` varchar(30) NOT NULL,
  `picture` BLOB,
  `bio` varchar(200),
  `dob` varchar(50)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ---------------------------------------------------------

--
-- Indexes for Inserted tables
--

--
-- Indexes for table `profiles`
--
ALTER TABLE `profiles`
  ADD PRIMARY KEY (`user_name`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`comment_id`);

--
-- Indexes for table `contacts`
--
ALTER TABLE `contacts`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `threads`
--
ALTER TABLE `threads`
  ADD PRIMARY KEY (`thread_id`);
ALTER TABLE `threads` ADD FULLTEXT KEY `thread_title` (`thread_title`,`thread_desc`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`sno`);

-- -------------------------------------------------------

--
-- AUTO_INCREMENT for Inserted tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `category_id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `comment_id` int(8) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `contacts`
--
ALTER TABLE `contacts`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `threads`
--
ALTER TABLE `threads`
  MODIFY `thread_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `sno` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
