#!/usr/bin/env ruby 1.9.3

# usage:
# $ ruby presenter.rb {excluded_name_1} {excluded_name_2}

require "date"

PRESENTERS_FILE = 'presenters.txt'
EXCLUDED_FILE = 'excluded_presenters.db'

presenters = (File.readlines PRESENTERS_FILE).map(&:strip).delete_if(&:empty?)
excluded = ARGV
previously_excluded = File.exists?(EXCLUDED_FILE) ? Marshal.load(File.binread(EXCLUDED_FILE)) : {}

unless excluded.empty?
    presenters -= excluded

    date_str = Date.today.to_s
    previously_excluded[date_str] ||= []
    excluded.each do |name|
        previously_excluded[date_str] << name
    end
    previously_excluded[date_str] = previously_excluded[date_str].sort.uniq
    File.open(EXCLUDED_FILE, 'w') {|f| f.write(Marshal.dump(previously_excluded)) }
end

puts "All presenters: "
puts presenters.sort.inspect
puts ""

puts "Excluded presenters: "
previously_excluded.each_pair do |k,v|
    puts k + ": " + v.inspect
end
puts ""

puts "The today's presenter is: *** " + presenters.sample + " ***"

