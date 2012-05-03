require 'rubygems'
require 'highline/import'
require 'capybara'

email = ask("Enter your email:  ") { |q| q.echo = true }
password = ask("Enter your password:  ") { |q| q.echo = "*" }
message = ask("Enter message:  ") { |q| q.echo = true }

browser = Capybara::Session.new(:selenium)
Capybara.app_host = 'https://www.facebook.com'
browser.visit '/'

browser.fill_in 'email', :with => email
browser.fill_in 'pass', :with => "#{password}\n"

browser.find('.uiMentionsInput').click
browser.fill_in 'xhpc_message_text', :with => message
#browser.find('Post').click
browser.click_on 'Post'

require 'debug'
